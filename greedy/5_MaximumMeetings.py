class Solution:
    def maximumMeetings(self, start, end):
        n = len(start)
        # Combine start and end times into a list of tuples
        meetings = [(start[i], end[i]) for i in range(n)]
        print("Meetings list created --> ", meetings)
        
        # Sort by end time (primary) and start time (secondary)
        meetings.sort(key=lambda x: (x[1], x[0]))
        print("Sorted meetings by end time --> ", meetings)
        
        lastEnd = -1
        count = 0
        
        # Iterate through the sorted meetings
        for s, e in meetings:
            if s > lastEnd:
                count += 1
                lastEnd = e

        return count


def main():
    # Input data
    start = [1, 3, 2, 0, 8, 5]
    end = [2, 4, 3, 7, 9, 9]

    # Instantiate the Solution class and call the method
    sol = Solution()
    result = sol.maximumMeetings(start, end)
    print("Solution --> ", result)


# Run the main function
main()
