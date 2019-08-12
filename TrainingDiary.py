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

data = aio.read(filename)
print("test")
fig,ax = plt.subplots(nrows=3,ncols=1,figsize=(8,7))
#fig.suptitle()

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
ax[0].set_ylim([15,35])
ax[0].set_xlim([0,np.max(data.time.values/np.timedelta64(1, 'm'))])
ax[0].set_ylabel("Stroke Rate / $spm$")

hrdataarray = data["hr"].values
means,bin_edges,binnumber = binned_statistic(data.time.values/np.timedelta64(1, 'm'),hrdataarray,bins=len(data.time.values)/5)
ax[1].plot(bin_edges[:-1]+(bin_edges[1]-bin_edges[0])/2,means)
ax[1].axhspan(96, 115, facecolor='grey', alpha=0.3)
ax[1].axhspan(115, 134, facecolor='blue', alpha=0.3)
ax[1].axhspan(134, 154, facecolor='green', alpha=0.3)
ax[1].axhspan(154, 173, facecolor='orange', alpha=0.3)
ax[1].axhspan(173, 193, facecolor='red', alpha=0.3)
ax[1].set_xlim([0,np.max(data.time.values/np.timedelta64(1, 'm'))])
ax[1].set_yticks((96,115,134,154,173,193))
ax[1].set_ylabel("Heart Rate / $bpm$")

speeddataarray = data["speed"].values
#speeddataarray = 500/speeddataarray-120
means,bin_edges,binnumber = binned_statistic(data.time.values/np.timedelta64(1, 'm'),speeddataarray,bins=len(data.time.values)/5)
ax[2].plot(bin_edges[:-1]+(bin_edges[1]-bin_edges[0])/2,means)
ax[2].set_xlabel("Time / $minutes$")
ax[2].set_ylabel("Speed /$ms^{-1}$")
#ax[2].set_ylim([-10,20])
ax[2].set_xlim([0,np.max(data.time.values/np.timedelta64(1, 'm'))])
fig.savefig("test.png",dpi=500,bbox_inches='tight',padding_inches=0)
plt.show()
