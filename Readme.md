# 热聊-伙伴匹配项目
## 介绍：帮助大家匹配志同道合的伙伴，（移动端 H5 网页版本 ）
### 项目地址

移动端代码Github：https://github.com/cool-icu0/likeSee-backend

移动端代码Gitee：https://gitee.com/partner-matching-system/likeSee-frontend

后端代码Github：https://github.com/cool-icu0/likeSee-frontend

后端代码Gitee：https://gitee.com/partner-matching-system/likeSee-backend
### 技术选型
#### 前端
1. Vue3
2. Vant4 UI
3. Vite2
4. Nginx
#### 后端
1. SpringBoot
2. SpringMVC+MyBatis+MyBatisPlus
3. MySQL
4. Redis
5. Swagger+Knife4j

### 功能介绍
1、用户可以在个人页编辑个人信息，为自己选择标签或者自定义标签，最后在首页匹配或搜索用户。
2、有意向队友可以点击用户名片进行聊天，聊天功能目前仅支持一对一对话，如对方不在线也可接收到消息。
3、用户可以发布贴文详细描述自己的需求寻找队友，或者输入关键字搜索目标贴文联系作者，对喜欢的贴文可以点赞，对内容不规范的贴文可以进行举报反馈；只有通过审核的贴文在移动端才会进行展示。
4、寻找好队友以后可以进行组队。
5、在个人页可以看到自己创建的队伍、加入的队伍、发布的贴文以及反馈，支持筛选。

### 功能亮点
1、封装用户卡片、队伍卡片、贴文卡片和tab栏等组件，实现组件复用，提高开发效率。
2、使用骨架屏在加载时显示占位符，增强用户使用体验。

### 待优化功能点
1、匹配用户的算法优化：比较单个标签的相似度（系统使用的算法是将单个标签直接当作字符，比较标签列表的相似度）、不区分英文大小写。
2、聊天功能的优化：支持群聊；支持发送图片或者表情包。
3、贴文功能优化：使用富文本编辑器，优化在移动端的展示格式；添加贴文评论功能。
4、组队功能优化：在队伍详情页支持展示所有成员，该队伍成员可互相联系。

### 使用说明
需要先有node环境，可先按照nvm管理工具，再用nvm安装node
1、npm install
2、npm run dev