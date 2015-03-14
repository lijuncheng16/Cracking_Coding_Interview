# Baidu Interview Question: Make a Ruler

def draw_ruler(N):
    # assume max_N < 17
    max_lines = 17
    if N == 1:
        x = 4
    elif N == 2:
        x = 3
    elif N > 8:
        x = 0
        max_lines = N * 4
    elif N > 4:
        x = 1
        max_lines = N * 4
    elif N > 2:
        x = 2
        max_lines = N * 4
        
    skip = 2**x
    
    currenti = 0
    for line in xrange(max_lines):
        strlist = ["-" for i in range(x+1)]
        if line % skip == 0:
            print("".join(strlist) + " %s" % currenti)
            currenti += 1
            
            if currenti > N:
                # done
                return
        
        elif line % (skip/2) == 0:
            print("".join(strlist[:-1]))
            
        elif line % (skip/4) == 0:
            print("".join(strlist[:-2]))
            
        elif line % (skip/8) == 0:
            print("".join(strlist[:-3]))
            
        
draw_ruler2(16)