# WordListGeneratorUsingJava
This is the first Wordlist Generator that I made using Java that can be used for cracking Wi-Fi passwords.

The Java version is faster than Python

I initially tried it out on my Wi-Fi router using all the wordlist that was provided by Kali Linux. The sad part was when none of the passwords in the wordlist was the password for my Router and the cracking failed.

So I created a wordlist using Java where I had to use n number of for loops where n is the number of characters needed(i.e., if the password was of 8 characters, the value of n would be 8, so I had to iterate through 8 for loops). Adding or removing extra loops for each value of 'n'.

Running the wordlist.py will generate a wordlist which will be huge in size as it contains all the possible combinations of the characters present in the string, thus it is recommended to have enough space before running the program.

The initial character start from 'A'(ASCII 65) till '~'(ASCII 176) which will contain a-z, A-Z, 0-9 and "!,@,#,$,%,^,&,\*,(,),". 
So the file size of the wordlist generated from this is 123GB but you will find every word of 8 characters possible from the characters used above.
