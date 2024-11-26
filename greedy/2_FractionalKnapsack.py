def FractionalKnapsack(val,wt,capacity):
    n = len(val)
    currentValue = 0
    currentWeight = 0
    
    items = [((val[i]/wt[i]),val[i],wt[i])for i in range(n)]
    print("The current Items Tuple Looks like : ",items)
    
    items.sort(reverse=True,key=lambda x:x[0])
    print("The Sorted Items Tuple Looks like : ",items)
    
    for ratio,value,weight in items:
        if currentWeight + weight <= capacity:
                # Take the full item
                currentWeight += weight
                currentValue += value
        else:
                # Take the fractional part of the item
                remainingCapacity = capacity - currentWeight
                currentValue += (value / weight) * remainingCapacity
                break
        
    return currentValue

def main():
    val = [60,100,120]
    wt = [10,20,30]
    cap = 50
    print("Calling the FK",FractionalKnapsack(val,wt,cap))

main()