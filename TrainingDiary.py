import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import activityio as aio
from scipy.stats import binned_statistic
import os.path, time

data = aio.read("testfile2.fit")

fig,ax = plt.subplots(figsize=(10,4))

print("Pick a data series to plot:")
name = input("("+", ".join(list(data))+")\n")
type(name)

print(time.localtime(os.path.getmtime('testfile2.fit')))
print(time.localtime(os.path.getmtime('testfile2.fit')))




means,bin_edges,binnumber = binned_statistic(data.time.values/np.timedelta64(1, 'm'),data[name].values,bins=len(data.time.values)/5)
ax.plot(bin_edges[:-1]+(bin_edges[1]-bin_edges[0])/2,means)
if (name=="hr"):
    ax.axhspan(96, 115, facecolor='grey', alpha=0.3)
    ax.axhspan(115, 134, facecolor='blue', alpha=0.3)
    ax.axhspan(134, 154, facecolor='green', alpha=0.3)
    ax.axhspan(154, 173, facecolor='orange', alpha=0.3)
    ax.axhspan(173, 193, facecolor='red', alpha=0.3)
fig.savefig("{}test.png".format(name),dpi=500,bbox_inches='tight',padding_inches=0)
ax.set_xlabel("Time")
ax.set_ylabel(name)
plt.show()
