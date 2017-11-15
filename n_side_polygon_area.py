#!/usr/bin/env python


# package "sysvbanner" should be installed in 'Debian' based
# package  " banner " should be installed in 'red hat ' based




from  os import *
import math



system(' echo  "\e[1;31m  $(banner polygon) \e[0m" ')
system(' sleep 0.7; echo "\t" ; echo  " \e[1;32m  $(banner area) \e[0m" ')
system(' sleep 0.7')

# program headline  
print(" ###### find out area of ' N ' sided regular polygon ####")
system(' sleep 0.7')

#taking number of sides of a polygon as variable number_of_sides
 
number__of__sides=input('enter the number of sides , n>=3 >>> \t\b\b\b')


#taking lenght of each side  as 'side_length
side__of__each__length=input('enter the length of a side >>> \t\b')

#this alogorithm is based on summation of area of symmetrical triangles in a regular polygon      

#altitude of each symmetrical triangle is given  
 
altitude=float((side__of__each__length/(2*round(math.tan(180/number__of__sides),8))))


#area of each triangle

area_triangle=float(0.5*side__of__each__length*altitude)


#total area of poltgon is multiple of each triangle

area_of_polygon=float(number__of__sides*area_triangle)


#printing output 

print  round(area_of_polygon,4)

system(' echo  "\e[1;34m  squnits  \e[0m" ') ; print "is the area "   



