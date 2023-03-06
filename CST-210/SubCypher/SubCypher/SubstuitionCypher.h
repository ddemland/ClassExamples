#pragma once

#include <string>
#include <vector>

using namespace std;

#define NumLettersInAlphabet	26
class SubstuitionCypher
{
private:
	vector<char> m_map;

public:
	SubstuitionCypher(vector<char> list);
	char EncryptChar(char ch);
	char DecryptChar(char ch);
	string EncryptString(string str);
	string DecryptString(string str);
};

