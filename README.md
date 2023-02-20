# javaMulitThreadDow
java多线程下载demo

**文件分段**

我们得到了文件的大小 fileSize，将其分为 N 段，则每一段的大小为 fileSize / N，由于文件通常不会正好被分为 N 段，因此最后一段就等于剩余的部分的大小。

我们用一个数组 endPoint 来存放每一段的起止位置，例如一个 10 B 的文件，起止范围是 0~9，如果分为 3 段下载，那么 endPoint = {0, 3, 6, 10}，对每段来说是左闭右开区间。

解释：对于第 i 段（i 从 0 开始）来说，从 endPoint[i] 开始下载，在 endPoint[i + 1] - 1 处停止。同理，对第 i + 1 段来说，从 endPoint[i + 1] 开始，在 endPoint[i + 2] - 1 处停止。