import { Component } from 'react'
import PropTypes from 'prop-types'

class WelcomeMessage extends Component {
  constructor(props) {
    super(props)
  }

  render() {
    const { name } = this.props
    return <p>Welcome {name}</p>
  }
}

WelcomeMessage.propTypes = {
  name: PropTypes.string.isRequired,
}

export default WelcomeMessage
