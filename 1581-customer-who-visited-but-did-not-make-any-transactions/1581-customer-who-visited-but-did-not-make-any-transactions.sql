# Write your MySQL query statement below
 Select customer_id , count(customer_id) as count_no_trans
from (Select customer_id
from Visits
Left Join Transactions on
Visits.visit_id = Transactions.visit_id
where Transactions.visit_id is null) as temp
group by customer_id;
