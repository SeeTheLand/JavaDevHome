INSERT INTO list_of_products(name, price, discount_number, discount_price)
VALUES ('A', 1.25, 3, 3.00),
       ('B', 4.25, null, null),
       ('C', 1.00, 6, 5.00),
       ('D', 0.75, null, null);

SELECT price FROM product_store.public.list_of_products