## Letter-Combinations-of-a-Phone-Number -- Recursion

Given a string containing digits from 2-9 inclusive, 

return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) 

is given below. Note that 1 does not map to any letters.

    1         2          3
           (a,b,c)    (d,e,f)
    4         5          6
 (g,h,i)   (j,k,l)    (m,n,o)
    7         8          9
 (p,q,r,s) (t,u,v)    (w,x,y,z)
    *         0          #
           (space)


Example1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Example 2:

Input: digits = ""
Output: []

Example 3:

Input: digits = "2"
Output: ["a","b","c"]