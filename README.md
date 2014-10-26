# meta

[![Build Status](https://travis-ci.org/shire-digest/meta.svg?branch=master)](https://travis-ci.org/shire-digest/meta)


## Pipeline

```
                                            +------------------+                                                        
                                            |                  |                                                        
                                    site    |  crawler #1      |                                                        
+-------------+      +-----------+          |                  |    post meta     +-------------+        +-------------+
|             |      |           |  list    |  crawler #2      |                  |             |        |             |
|  config.clj +------+ producer  +----------+                  +------------------+ generator(s)+--------+  delivery   |
|             |      |           |          |  crawler #3      |                  |             |        |             |
+-------------+      +-----------+          |                  |                  +-------------+        +-------------+
                                            |  crawler #4      |                                                        
                                            |                  |                                                        
                                            +------------------+                                                        
```


## Config.clj

```clojure
{:sites {"http://en.wikipedia.org" {:crawler :en-tfa
                                    :options {}}
         ; Options is omittable.
         "http://example.org" {:crawler :echo}}

 :generators {:simple {:path "/var/temp/simple-output"}
              :mail {:receiver ["hbc@vtmer.com"]}
              :anothoer-generator {}}}
```


## TODO

- [ ] use macros to improve `config.clj`'s readability.


## License

Copyright © 2014 hbc

Distributed under the [SMPPL](https://github.com/xhacker/SMPPL/blob/master/SMPPL-Freeware.md) License.
