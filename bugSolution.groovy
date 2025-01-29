```groovy
class MyClass {
    def myMethod(List<String> list) {
        if (list != null) {
            list.each { element ->
                println element
            }
        }
    }
}

MyClass myObject = new MyClass();
myObject.myMethod(null);
myObject.myMethod(['a', 'b', 'c']);
```