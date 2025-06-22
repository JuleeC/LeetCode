class Solution:
    def divideString(self, s: str, k: int, fill: str) -> List[str]:
        q, r =divmod(len(s), k)
        ans=[""]*(q+(r>0))
