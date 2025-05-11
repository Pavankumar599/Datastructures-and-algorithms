class CountPrimes:
    def countPrimes(self, n: int) -> int:
        if n <= 2:
            return 0
        seive = [True] * n
        seive[0] = seive[1] = False
        
        for i in range(2,int(n*0.5) + 1):
            if seive[i]:
                for j in range(i*2,n,i):
                    
                    seive[j] = False
        return sum(seive)

print("Enter n value")
n = int(input())
obj = CountPrimes()
result = obj.countPrimes(n)
print(f"Number of Primes Less then {n} is : {result}")
