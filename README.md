# What is Huffman coding?
Huffman coding is a lossless data compression algorithm. The idea is to assign variable
length codes to input characters; lengths of the assigned codes are based on the 
frequencies of corresponding characters. The most frequent character gets the smallest 
code and the least frequent character gets the largest code. 
The variable-length codes assigned to input characters are Prefix Codes, means the codes 
(bit sequences) are assigned in such a way that the code assigned to one character is not 
prefix of code assigned to any other character. This is how Huffman Coding makes sure 
that there is no ambiguity when decoding the generated bit stream.

## Project Description
In this project, you will be using a priority queue and a binary tree of your design to 
implement a file compression/uncompression algorithm called "Huffman Coding". 
Your program will read any file and compress it using your implementation of the 
Huffman coding algorithm found in the explanation. The compressed data will be written 
to a file. That compressed file will be then be read back by your program and 
uncompressed. The uncompressed text will then be written to a third file. The 
uncompressed file should of course match the original file. 

## ⏳Summary of Processing 
• Read the specified file and count the frequency of all bytes in the file. 
• Create the Huffman coding tree based on the frequencies. 
• Create and display a table of encodings for each byte from the Huffman coding 
tree. 
• Encode the file and output the encoded/compressed file. 
• Display the header that include the Huffman code.
