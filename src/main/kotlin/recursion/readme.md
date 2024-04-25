# Recursion

### <ins>Explanation</ins>
1) A recursive function calls itself to solve an issue
2) In recursive functions there is a base case and a recursive case, without the base case it is likely you will 
accidentally induce an infinite loop

### <ins>Visual</ins>
```kotlin
fun countDownToZero(number: Int) {
    // Base Case
    if (number <= 0) {
        return
    } 
    // Recursive Case
    else {
        return countDownToZero(number - 1)
    }
}
```