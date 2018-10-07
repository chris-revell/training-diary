import numpy as np
import numpy.ma as ma
import pandas as pd
import matplotlib.pyplot as plt
import activityio as aio
from scipy.stats import binned_statistic
import os
import datetime
from sys import argv

filename = argv[1]

def RepresentsInt(s):
    try:
        int(s)
        return True
    except ValueError:
        return False

def chartodaymonthhour(char):
    if (RepresentsInt(char)):
        return(ord(char)-48)
    else:
        return(ord(char)-55)

def extractdateandtime(filename):
    dateandtime = []
    dateandtime.append("201{}".format(filename[0]))
    dateandtime.append(str(chartodaymonthhour(filename[1])))
    dateandtime.append(str(chartodaymonthhour(filename[2])))
    dateandtime.append(str(chartodaymonthhour(filename[3])))
    dateandtime.append(filename[4:6])
    dateandtime.append(filename[6:8])
    return "-".join(dateandtime)

print(extractdateandtime("88752851"))

data = aio.read(filename)

fig,ax = plt.subplots(nrows=3,ncols=1,figsize=(10,7))
fig.suptitle(extractdateandtime(filename))

caddataarray = data["cad"].values
for i,m in enumerate(caddataarray):
    if m > 35:
        caddataarray[i] = caddataarray[i-1]
    else:
        pass
means,bin_edges,binnumber = binned_statistic(data.time.values/np.timedelta64(1, 'm'),caddataarray,bins=len(data.time.values)/5)
ax[0].plot(bin_edges[:-1]+(bin_edges[1]-bin_edges[0])/2,means)
ax[0].axhline(y=20,ls="--",color="Grey",alpha=0.3)
ax[0].axhline(y=22,ls="--",color="Grey",alpha=0.3)
ax[0].axhline(y=24,ls="--",color="Grey",alpha=0.3)
ax[0].axhline(y=26,ls="--",color="Grey",alpha=0.3)
ax[0].axhline(y=28,ls="--",color="Grey",alpha=0.3)
ax[0].axhline(y=30,ls="--",color="Grey",alpha=0.3)
ax[0].axhline(y=32,ls="--",color="Grey",alpha=0.3)
ax[0].set_ylim([10,40])
ax[0].set_ylabel("Stroke Rate")

hrdataarray = data["hr"].values
means,bin_edges,binnumber = binned_statistic(data.time.values/np.timedelta64(1, 'm'),hrdataarray,bins=len(data.time.values)/5)
ax[1].plot(bin_edges[:-1]+(bin_edges[1]-bin_edges[0])/2,means)
ax[1].axhspan(96, 115, facecolor='grey', alpha=0.3)
ax[1].axhspan(115, 134, facecolor='blue', alpha=0.3)
ax[1].axhspan(134, 154, facecolor='green', alpha=0.3)
ax[1].axhspan(154, 173, facecolor='orange', alpha=0.3)
ax[1].axhspan(173, 193, facecolor='red', alpha=0.3)
ax[1].set_ylabel("Heart Rate")

speeddataarray = data["speed"].values
means,bin_edges,binnumber = binned_statistic(data.time.values/np.timedelta64(1, 'm'),speeddataarray,bins=len(data.time.values)/5)
ax[2].plot(bin_edges[:-1]+(bin_edges[1]-bin_edges[0])/2,means)
ax[2].set_xlabel("Time")
ax[2].set_ylabel("Speed")
ax[2].set_ylim([2,4.5])
fig.savefig("test.png",dpi=500,bbox_inches='tight',padding_inches=0)
plt.show()
