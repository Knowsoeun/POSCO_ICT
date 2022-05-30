- React: 자바 스크립트 라이브러리  
```cmd
> npx create-react-app 20220530(프로젝트명)
> y
> cd 20220530(프로젝트명)
> npm start
```
- vs에서 코드열 때 파일 들어가서 **마우스 우클릭** 후 **터미널에서 열기** 클릭
```cmd
> code .
```
- 다음과 같이 바꿔 쓸 수 있다.
```js
class ProductCategoryRow =(props)=> {
  //class ProductCategoryRow extends React.Component {
    const category = props.category;
    return (
      <tr>
        <th colSpan="2">
          {category}
        </th>
      </tr>
    );
}
```
```js
class ProductCategoryRow extends React.Component {
  render() {
    const category = this.props.category;
    return (
      <tr>
        <th colSpan="2">
          {category}
        </th>
      </tr>
    );
  }
}
```
