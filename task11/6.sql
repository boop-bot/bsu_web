SELECT U.user_login, P.product_creation_date, P.product_desciption FROM profit.products P INNER JOIN profit.users U ON P.product_vendor = U.user_login ORDER BY P.product_creation_date;