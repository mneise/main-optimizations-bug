# main-optimizations-bug

Simple project to reproduce a bug in ClojureScript where foreign libraries are not included into the final build when using the compiler option `:main` with either `:simple` or `:advanced` optimization. To reproduce, run the following script:

```
$ ./scripts/release
```
Then open `index_release.html`.

## License

Copyright © 2015 Maria Geller

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
