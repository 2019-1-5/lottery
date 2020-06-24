#git实战学习

#初始化仓库
git init

#添加到暂存区
git add {filename|dirname}

#将暂存区的文件进行一次提交
git commit -m "{本次提交的说明}"

#查看远程仓库
git remote -v

#添加远程仓库
git remote add origin {远程仓库地址，可以用http协议的，也可以是git协议}

#推送代码
git push origin master

#拉取代码
git pull origin master