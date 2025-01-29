# Groovy NullPointerException with Safe Navigation Operator and each()

This example demonstrates a potential NullPointerException that can occur in Groovy even when using the safe navigation operator (?) with the `each` method.

The issue arises when a null list is passed to a method that utilizes the safe navigation operator and attempts to iterate over the list using `each`. While the safe navigation operator prevents a NullPointerException on the `list?.each` line itself, the implicit null check within the `each` method does not prevent an exception if the list is null.

## How to Reproduce

1. Run the provided `bug.groovy` script.
2. Observe the `NullPointerException`. 

## Solution

The `bugSolution.groovy` script demonstrates a solution where we explicitly check for null before using the each method.