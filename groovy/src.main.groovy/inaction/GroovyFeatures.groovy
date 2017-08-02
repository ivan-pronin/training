package inaction

import static groovyx.gpars.GParsPool.withPool

class GroovyFeatures {

    static void main(String[] args) {
        def urls = [
            'http://www.groovy-lang.org/',
            'http://google.org/',
            'http://www.gr8conf.org/'
        ]*.toURL()

        println withPool {
            urls.collectParallel {
                it.text.findAll(~/[Gg]roovy/).size()
            }
        }
    }
}
