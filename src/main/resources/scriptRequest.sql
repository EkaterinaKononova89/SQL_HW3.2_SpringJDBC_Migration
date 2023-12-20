select product_name from netology.CUSTOMERS c
join netology.ORDERS o on c.id = o.customer_id
where lower(name) = lower(:firstName) ;