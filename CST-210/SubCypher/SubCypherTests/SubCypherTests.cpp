#include "pch.h"
#include "CppUnitTest.h"

#include "SubstuitionCypher.cpp"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace SubCypherTests
{
	TEST_CLASS(SubCypherTests)
	{
	public:
		
		TEST_METHOD(TestEncryptChar)
		{
			vector<char> map =
			{
				'D',
				'B',
				'Q',
				'R',
				'X',
				'Y',
				'H',
				'L',
				'M',
				'G',
				'Z',
				'K',
				'J',
				'C',
				'P',
				'N',
				'W',
				'F',
				'E',
				'U',
				'V',
				'T',
				'I',
				'S',
				'A',
				'O'
			};

			auto subcipher = new SubstuitionCypher(map);
			auto ch = subcipher->EncryptChar('L');
			Assert::AreEqual(ch, 'K');

			ch = subcipher->DecryptChar('V');
			Assert::AreEqual(ch, 'U');
		}

		TEST_METHOD(TestEncryptString)
		{
			vector<char> map =
			{
				'D',
				'B',
				'Q',
				'R',
				'X',
				'Y',
				'H',
				'L',
				'M',
				'G',
				'Z',
				'K',
				'J',
				'C',
				'P',
				'N',
				'W',
				'F',
				'E',
				'U',
				'V',
				'T',
				'I',
				'S',
				'A',
				'O'
			};

			auto subcipher = SubstuitionCypher(map);
			auto str = subcipher.EncryptString("TESTING");
			Assert::AreEqual(str[0], 'U');
			Assert::AreEqual(str[1], 'X');
			Assert::AreEqual(str[2], 'E');
			Assert::AreEqual(str[3], 'U');
			Assert::AreEqual(str[4], 'M');
			Assert::AreEqual(str[5], 'C');
			Assert::AreEqual(str[6], 'H');

			str = subcipher.DecryptString("UXEUMCH");
			Assert::AreEqual(str[0], 'T');
			Assert::AreEqual(str[1], 'E');
			Assert::AreEqual(str[2], 'S');
			Assert::AreEqual(str[3], 'T');
			Assert::AreEqual(str[4], 'I');
			Assert::AreEqual(str[5], 'N');
			Assert::AreEqual(str[6], 'G');
		}
	};
}
