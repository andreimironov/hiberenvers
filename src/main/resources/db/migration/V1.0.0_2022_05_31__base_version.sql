CREATE TABLE simple_entity
(
    simple_entity_id BIGSERIAL NOT NULL PRIMARY KEY,
    name             TEXT,
    payload jsonb
);
