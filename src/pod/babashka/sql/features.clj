(ns pod.babashka.sql.features
  {:no-doc true})

(def postgresql? (= (System/getenv "POD_DB_TYPE") "postgresql"))
(def hsqldb? (= (System/getenv "POD_DB_TYPE") "hsqldb"))
(def oracle? (= (System/getenv "POD_DB_TYPE") "oracle"))
(def mssql? (= (System/getenv "POD_DB_TYPE") "mssql"))
(def snowflake? (= (System/getenv "POD_DB_TYPE") "snowflake"))
