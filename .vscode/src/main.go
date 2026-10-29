package main

import "fmt"

func main() {
    myList := []int{1,2,3}

    for index, value := range myList {fmt.Printf("%d is index, %d is value\n", index, value)}
}
