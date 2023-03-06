#include "SubstuitionCypher.h"

SubstuitionCypher::SubstuitionCypher(vector<char> list)
{
	m_map = list;
}

char SubstuitionCypher::EncryptChar(char ch)
{
	auto idx = ch - 'A';
	if ((idx < 0) || (idx > NumLettersInAlphabet))
	{
		return ' ';
	}

	return m_map[idx];
}

char SubstuitionCypher::DecryptChar(char ch)
{
	vector<char>::iterator it = find(m_map.begin(), m_map.end(), ch);
	if (it != m_map.end())
	{
		auto idx = (it - m_map.begin());
		return idx + 'A';
	}

	return ' ';
}

string SubstuitionCypher::EncryptString(string str)
{
	string retStr = "";
	for (auto idx = 0; idx < str.length(); idx ++)
	{
		char ch;
		ch = EncryptChar(str[idx]);
		retStr += ch;
	}

	return retStr;
}

string SubstuitionCypher::DecryptString(string str)
{
	string retStr = "";
	for (auto idx = 0; idx < str.length(); idx ++)
	{
		char ch;
		ch = DecryptChar(str[idx]);
		retStr += ch;
	}

	return retStr;
}
