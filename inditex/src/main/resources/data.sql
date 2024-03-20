
-- PRODUCT
INSERT INTO products (id, name, description) VALUES (35455, 'Product Name', 'Product Description');

-- BRAND
INSERT INTO brands (id, name, address) VALUES (1, 'ZARA', 'Brand Address');

-- PRICES
INSERT INTO prices (brand_id, start_date, end_date, price_list, product_id, priority, price, curr) VALUES (1, '2020-06-14 00:00:00', '2020-12-31 23:59:59', 1, 35455, 0, 35.50, 'EUR');
INSERT INTO prices (brand_id, start_date, end_date, price_list, product_id, priority, price, curr) VALUES (1, '2020-06-15 16:00:00', '2020-12-31 23:59:59', 4, 35455, 1, 38.95, 'EUR');
INSERT INTO prices (brand_id, start_date, end_date, price_list, product_id, priority, price, curr) VALUES (1, '2020-06-14 00:00:00', '2020-12-31 23:59:59', 1, 35455, 0, 35.50, 'EUR');
INSERT INTO prices (brand_id, start_date, end_date, price_list, product_id, priority, price, curr) VALUES (1, '2020-06-14 15:00:00', '2020-06-14 18:30:00', 2, 35455, 1, 25.45, 'EUR');
