# DESCRIPTION:
The code demonstrates the Pipe and Filter design pattern. It processes a list of numbers using a sequence of filters, where each filter modifies or filters
out numbers based on certain conditions.
# Working of code:
# Initialize Input Data:
A list of numbers (1 to 10) is created.
# Create a Pipeline of Filters:
A list of filters is defined, where each filter is a function that processes the list.
# Apply Filters in Sequence:
The processPipeline method takes the input list and applies each filter one by one.
# Filters Used in the Code:
Filter Even Numbers: Keeps only even numbers.
Square Numbers: Replaces each number with its square (number × number).
Filter Numbers Greater Than 10: Removes numbers that are ≤ 10.
Filter Prime Numbers: Keeps only prime numbers.
Cube Numbers: Replaces each number with its cube (number × number × number).
Filter Odd Numbers: Keeps only odd numbers.
Final Output:The transformed list is printed after all filters have been applied.
