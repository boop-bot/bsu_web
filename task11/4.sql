WITH P AS (SELECT * FROM profit.products WHERE product_valid_until >= CURRENT_DATE())
SELECT U.user_id, U.user_login, count(*)'posts number' 
FROM profit.users U INNER JOIN P AS T on T.product_vendor = U.user_id
GROUP BY user_login having count(*) >= 3;