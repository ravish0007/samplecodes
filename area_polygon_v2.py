#!/usr/bin/env python


import matplotlib.pyplot as plt
import numpy as np

import os
from math import * 



os.system(' echo  "\e[1;31m  $(banner polygon) \e[0m" ')
os.system(' sleep 0.7; echo "\t" ; echo  " \e[1;32m  $(banner area) \e[0m" ')
os.system(' sleep 0.7')


print(" ###### find out area of ' N ' sided regular polygon ####")
os.system(' sleep 0.7')


n = input('enter the number of sides , n>=3 >>> \t\b\b\b')

print(n)
type(n)

radius = input('enter the radius >>> \t\b')
 


pi = 3.141592653589793


   



area_of_polygon=round(float( pi * radius * radius * (sin( 2*pi / n) / (2*pi/n))),11)




print  round(area_of_polygon,11)

os.system(' echo  "\e[1;34m  squnits  \e[0m" ') ; print "is the area "   

t = np.arange(1, 1000000, 50000) 
s=t * np.cos(pi/t)* np.sin(pi/t)
print s
fig, ax = plt.subplots()
ax.plot(t, s)

ax.set(xlabel='radius (m)', ylabel='area (sqm)',
       title='All about pi')
ax.grid()


plt.show()

print
print
print


