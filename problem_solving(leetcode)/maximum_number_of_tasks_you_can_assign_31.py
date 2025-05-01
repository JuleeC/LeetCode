class Solution(object):
    def maxTaskAssign(self, tasks, workers, pills, strength):
        tasks.sort()
        workers.sort()
        left, right = 0, min(len(tasks), len(workers))

        while left < right:
            mid = (left + right + 1)//2
            usedPills = 0
            avail = workers[-mid:]
            canAssign = True

