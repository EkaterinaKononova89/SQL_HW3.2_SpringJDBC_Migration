select product_name from netology2.CUSTOMERS2 c
join netology2.ORDERS2 o on c.id = o.customer_id
where lower(name) = lower(:firstName) ;