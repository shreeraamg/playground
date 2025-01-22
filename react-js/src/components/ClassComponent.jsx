import { Component } from 'react'
import WelcomeMessage from './WelcomeMessage'

class ClassComponent extends Component {
  constructor(props) {
    super(props)
  }

  render() {
    return (
      <div>
        <h1 className="text-4xl font-bold">Class Component</h1>
        <WelcomeMessage name="John Doe" />
      </div>
    )
  }
}

export default ClassComponent
