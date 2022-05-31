CREATE TABLE revinfo
(
    rev      integer NOT NULL,
    revtstmp bigint,
    CONSTRAINT revinfo_pkey PRIMARY KEY (rev)
);

CREATE TABLE simple_entity_aud
(
    simple_entity_id bigint  NOT NULL,
    name             text,
    payload          jsonb,
    rev              integer NOT NULL,
    revtype          smallint, -- тип операции с сущностью: 0 - create, 1 - update, 2 - delete
    CONSTRAINT simple_entity_aud_pkey PRIMARY KEY (simple_entity_id, rev),
    CONSTRAINT simple_entity_aud_revinfo FOREIGN KEY (rev) REFERENCES revinfo (rev)
        MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

CREATE SEQUENCE hibernate_sequence MAXVALUE 9223372036854775807;
