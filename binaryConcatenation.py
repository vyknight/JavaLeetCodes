class Solution:
    def concatenatedBinary(self, n: int) -> int:
        conc_target = ''
        for i in range(0, n - 1):
            conc = conc + convertToBinary(i)

        def convertToBinary(n: int) -> str:
            t = n
            curr = ''
            while t > 0:
                curr = curr + str(n%2)
                n = n/2
            return curr
        