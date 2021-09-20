Exception
1.Write a method whose input is a two-dimensional string array with a size of 4x4, when submitting an array of a different size, you must throw a MyArraySizeException exception.
2.Next, the method should go through all the elements of the array, convert it to int, and sum it up. If the conversion failed in some element of the array (for example, a cell contains a symbol or text instead of a number),a MyArrayDataException exception should be thrown, detailing which cell contains the incorrect data
3.In the main() method, call the received method, handle possible exceptions MySizeArrayException and MyArrayDataException, and output the calculation result.
