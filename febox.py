#!/usr/bin/python3


import sys
import re


file = open(sys.argv[1]).read()


#print(repr(file))


print("#include<stdio.h>")
print("#include<stdlib.h>")
print("int main()")


print("{")





print(' char *str  =  " python3  -c \\"'     + repr(file)[1:-1] +  ' \\"  ";' ) ;
print(' system(str)  ; ')



print("}")

