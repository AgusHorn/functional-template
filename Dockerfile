# getting base image clojure
FROM clojure

COPY ./ .

CMD ["lein", "test"]



