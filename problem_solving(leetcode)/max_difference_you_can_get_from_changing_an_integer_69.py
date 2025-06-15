class Solution:
    def maxDiff(self, num: int) -> int:
        s = str(num)

        match = re.search(r'[^9]', s)
        maxDigit = match.group() if match else None
        max = int(s.replace(maxDigit, '9')) if maxDigit else num

        if s[0] != '1':
            min = int(s.replace(s[0], '1'))

