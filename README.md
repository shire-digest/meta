# meta

[![Build Status](https://travis-ci.org/shire-digest/meta.svg?branch=master)](https://travis-ci.org/shire-digest/meta)


## Pipeline

```
                                                +--------------------------+                                                        
                                                |                          |                                                        
                                        site    |  crawler #1              |                                                        
+-------------+          +-----------+          |                          |    post meta     +-------------+        +-------------+
|             |          |           |  list    |  crawler #2              |                  |             |        |             |
|  config.clj +----------+ producer  +----------+                          +------------------+ generator(s)+--------+  delivery   |
|             |          |           |          |  crawler #3              |                  |             |        |             |
+-------------+          +-----------+          |                          |                  +-------------+        +-------------+
                                                |  crawler #4              |                                                        
                                                |                          |                                                        
                                                +--------------------------+                                                        
```


## License

Copyright © 2014 hbc

Distributed under the [SMPPL](https://github.com/xhacker/SMPPL/blob/master/SMPPL-Freeware.md) License.
