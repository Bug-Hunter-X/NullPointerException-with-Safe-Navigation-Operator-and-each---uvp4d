```groovy
class MyClass {
    def myMethod(List<String> list) {
        list?.each { element ->
            println element
        }
    }
}

MyClass myObject = new MyClass();
myObject.myMethod(null);
```