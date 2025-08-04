# Write your MySQL query statement below
Select product_name , year , price
from Sales A
Left Join Product B on
A.product_id = B.product_id;