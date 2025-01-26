const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm91crh/",
            name: "ssm91crh",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm91crh/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "美特超市进销存管理系统"
        } 
    }
}
export default base
