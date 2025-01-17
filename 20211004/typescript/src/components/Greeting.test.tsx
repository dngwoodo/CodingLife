import { render } from '@testing-library/react';

import Greeting from './Greeting';

describe('Greeting', () => {
  it('renders greeting message', () => {
    const { container } = render(<Greeting name="world" />);

    expect(container).toHaveTextContent('Hello, world!');
  });
});
