import time
import threading

class Clock:

    def display_time(self):
        digits = {
            '0': [' 0000 ', '0    0', '0    0', '0    0', ' 0000 '],
            '1': ['  1   ', ' 11   ', '   1  ', '   1  ', ' 1111 '],
            '2': [' 222  ', '2   2 ', '   2  ', ' 2    ', ' 2222 '],
            '3': [' 3333 ', '    3 ', '  333 ', '    3 ', ' 3333 '],
            '4': ['   4  ', '  44  ', ' 4 4  ', '44444 ', '   4  '],
            '5': [' 5555 ', ' 5    ', ' 555  ', '    5 ', ' 555  '],
            '6': [' 6666 ', ' 6    ', ' 666  ', '6   6 ', ' 666  '],
            '7': [' 7777 ', '    7 ', '   7  ', '  7   ', '  7   '],
            '8': [' 8888 ', '8   8 ', ' 888  ', '8   8 ', ' 8888 '],
            '9': [' 9999 ', '9   9 ', ' 9999 ', '    9 ', ' 999  '],
            ':': ['      ', '  ::  ', '      ', '  ::  ', '      '],
        }

        while not hasattr(self, 'stop'):
            current_time = time.strftime('%H:%M:%S')
            time_display = [''] * 5

            for char in current_time:
                if char in digits:
                    digit = digits[char]
                    for i in range(5):
                        time_display[i] += digit[i] + '  '
                elif char == ':':
                    colon = digits[':']
                    for i in range(5):
                        time_display[i] += colon[i] + '  '

            for line in time_display:
                print("\r" + line)
            
            time.sleep(1)

clock = Clock()
thread = threading.Thread(target=clock.display_time)
thread.start()

input()
clock.stop = True
