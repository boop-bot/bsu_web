SELECT P.product_id, P.product_desciption, P.product_creation_date, P.product_link, P.product_vendor, P.product_photo_link, P.product_valid_until, P.product_discount, P.product_rating  FROM profit.products P 
INNER JOIN (SELECT product_id, COUNT(*) AS 'count_reviews' FROM profit.reviews GROUP BY product_id) AS R
ON R.product_id = P.product_id
WHERE count_reviews >= 3;