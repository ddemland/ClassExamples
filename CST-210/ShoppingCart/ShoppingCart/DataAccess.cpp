
#include "DataAccess.h"
#include "Soap.h"
#include "Meat.h"
#include "Fruit.h"

DataAccess::DataAccess(string fileName)
{
    m_fileName = fileName;
}

string DataAccess::CreateCartRecord(Cart &cart)
{
    return format("{},{}", CartRecord, cart.FormatForCSV());
}

string DataAccess::CreateCustomerRecord(Customer *customer)
{
    return format("{},{}", CustomerRecord, customer->FormatForCSV());
}

string DataAccess::CreateItemRecord(Item &item, int orderNum)
{
    return format("{},{},{}", ItemRecord, orderNum, item.FormatForCSV());
}

vector<string> DataAccess::Split(string str, string token)
{
    vector<string>result;
    while (str.size())
    {
        int index = str.find(token);
        if (index != string::npos)
        {
            result.push_back(str.substr(0, index));
            str = str.substr(index + token.size());
            if (str.size() == 0)
            {
                result.push_back(str);
            }
        }
        else
        {
            result.push_back(str);
            str = "";
        }
    }

    return result;
}

void DataAccess::SaveData(Cart &cart)
{
    ofstream file;
    file.open(m_fileName);
    auto str = CreateCartRecord(cart);
    file << str << endl;
    str = CreateCustomerRecord(cart.GetCustomer());
    file << str << endl;
    auto itemList = cart.GetCustomer()->GetItems();
    for (auto cnt = 0; cnt < itemList.size(); cnt ++)
    {
        str = CreateItemRecord(*itemList[cnt], cart.GetCustomer()->GetOrderNumber());
        file << str << endl;
    }

    file.close();
}

Cart DataAccess::LoadData(void)
{
    fstream file;
    file.open(m_fileName, ios::in);
    if (!file.is_open())
    {
        throw runtime_error("Could not open file");
    }

    auto customer = new Customer();
    Cart cart;
    cart.SetCustomer(customer);
    string line;
    while (getline(file, line))
    {
        auto parts = Split(line, ",");
        switch (parts[0][0])
        {
            case '1':
                cart.SetCartNumber(atoi(parts[1].c_str()));
                break;

            case '2':
                customer->SetID(atoi(parts[1].c_str()));
                customer->SetOrderNumber(atoi(parts[2].c_str()));
                break;

            case '3':
                auto itemType = atoi(parts[2].c_str());
                auto quantity = atoi(parts[3].c_str());
                auto price = atof(parts[4].c_str());
                auto totalPrice = atof(parts[5].c_str());
                auto description = parts[6].c_str();
                switch (itemType)
                {
                    case 1:
                        customer->Add(new Soap(quantity, price, description, totalPrice));
                        break;

                    case 2:
                        customer->Add(new Meat(quantity, price, description, totalPrice));
                        break;

                    case 3:
                        customer->Add(new Fruit(quantity, price, description, totalPrice));
                        break;
                }

                break;
        }
    }

    return cart;
}
