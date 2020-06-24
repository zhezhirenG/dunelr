# dunelr
文件同步服务，拟采用增量同步方式，移动方式宛如沙丘，故名为dune，lr的后缀灵感来自droplr。开发中...

## 目标
打造一个基于C/S结构的文件同步应用，具有以下基本功能：
- 客户端
    - 用户可以指定一个文件夹为同步文件夹，里面所有文件将会被纳入同步
    - 客户端连接服务端，上线时即可自动同步服务端的文件，用户可以随意随时修改查看新建同步文件夹中的文件
    - 用户修改完文件后，客户端会自动将修改后的文件同步到服务端
    - 即使同步过程中客户端掉线，恢复后也可以继续自动同步上一次的文件
- 服务端
    - 依据版本号查看服务端文件
    - 选择是否将服务端的同步文件夹同步到本地
    - 暂不允许增删改查服务端文件（工作量太大）
    
开发中...

